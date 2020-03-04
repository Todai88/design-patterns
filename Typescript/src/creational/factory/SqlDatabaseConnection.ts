import { DatabaseConnection } from './DatabaseConnection';
import { Database } from './Database';
import { SqlDatabase } from './SqlDatabase';

export class SqlDatabaseConnection extends DatabaseConnection {
  createDatabaseConnection(): Database {
    return new SqlDatabase();
  }
}
