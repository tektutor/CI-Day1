package org.tektutor.main;

import org.tektutor.frontend.*;
import org.tektutor.businesslayer.*;
import org.tektutor.dataaccesslayer.*;

public class Main {

	public static void printModuleName() {
		System.out.println ("Main module");
	}

	public static void main ( String args[] ){

		FrontEnd fe = new FrontEnd();
		BusinessLayer bl = new BusinessLayer();
		DataAccessLayer dal = new DataAccessLayer();

		printModuleName();

		fe.printModuleName();
		bl.printModuleName();
		dal.printModuleName();

	}
}
