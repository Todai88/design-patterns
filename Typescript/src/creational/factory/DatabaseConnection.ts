import { Database } from './Database';

export abstract class DatabaseConnection {
  abstract createDatabaseConnection(): Database;

  runCommand = (command: string): void => {
    let db: Database = this.createDatabaseConnection();
    console.log(db.runQuery(command));
  };
}
