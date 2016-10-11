package tel_ran.databases.mongo.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tel_ran.databases.mongo.MongoConnection;

public class MongoConnectionTests {

	@Test
	public void testMongoConnection() {
		MongoConnection connection1 = MongoConnection.getMongoConnection
				("mongodb://root:12345@ds053166.mlab.com:53166/", "bsh_persons");
		MongoConnection connection2 = MongoConnection.getMongoConnection
				("mongodb://root:12345@ds053166.mlab.com:53166/", "bsh_persons");
		assertTrue(connection1 == connection2);
		assertTrue(connection1.getDataBase() != null);
		MongoConnection connection3 = MongoConnection.getMongoConnection
				("mongodb://root:12345@ds053166.mlab.com:53166/", "bsh_persons2");
		assertTrue(connection1 != connection3);

	}

}
