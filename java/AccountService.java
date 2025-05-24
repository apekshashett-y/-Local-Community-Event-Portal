import java.sql.*;

public class AccountService {
    private Connection conn;

    public AccountService(Connection conn) {
        this.conn = conn;
    }

    public void transfer(int fromAccountId, int toAccountId, double amount) throws SQLException {
        try {
            conn.setAutoCommit(false);

            // Debit from source account
            try (PreparedStatement debitStmt = conn.prepareStatement(
                    "UPDATE accounts SET balance = balance - ? WHERE id = ?")) {
                debitStmt.setDouble(1, amount);
                debitStmt.setInt(2, fromAccountId);
                debitStmt.executeUpdate();
            }

            // Credit to destination account
            try (PreparedStatement creditStmt = conn.prepareStatement(
                    "UPDATE accounts SET balance = balance + ? WHERE id = ?")) {
                creditStmt.setDouble(1, amount);
                creditStmt.setInt(2, toAccountId);
                creditStmt.executeUpdate();
            }

            conn.commit();
        } catch (SQLException e) {
            conn.rollback();
            throw e;
        } finally {
            conn.setAutoCommit(true);
        }
    }
}
