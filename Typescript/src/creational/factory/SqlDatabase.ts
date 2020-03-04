import { Database } from './Database';
export class SqlDatabase implements Database {
  runQuery(command: string): string {
    return `I'm running a ${command} command in a SQL database :x`;
  }
}
