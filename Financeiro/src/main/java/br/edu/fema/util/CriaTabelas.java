package br.edu.fema.util;

import javax.persistence.Persistence;

public class CriaTabelas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Persistence.createEntityManagerFactory("FinanceiroPU");
		} catch (Exception e) {
			System.out.println("Error:" + e);
		}

	}

}
