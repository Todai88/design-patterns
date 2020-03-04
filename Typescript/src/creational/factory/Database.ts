export interface Database {
  runQuery(command: string): string;
}
