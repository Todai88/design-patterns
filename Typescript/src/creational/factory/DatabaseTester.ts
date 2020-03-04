import { SqlDatabaseConnection } from './SqlDatabaseConnection';
import { DatabaseConnection } from './DatabaseConnection';

let dbc: DatabaseConnection;
const main = () => {
  configure();
  bizLogic();
};

const configure = () => {
  dbc = new SqlDatabaseConnection();
};

const bizLogic = () => {
  dbc.runCommand('SELECT');
};

main();
