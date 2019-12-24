package com.design_patterns.demo.factory;

/**
 * @author DucDT
 */
public class SecureFactory extends AbstractFactory {

    @Override
    public Connection createConnection(String type) {
        switch (type) {
            case "Oracle": return new OracleConnection();
            case "MySQL": return new MySQLConnection();
            case "PostgeSQL": return new PostgeSQLConnection();
        }
        return new Connection();
    }
}
