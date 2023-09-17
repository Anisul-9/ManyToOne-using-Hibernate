package com.jsp.many_to_one_uni;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class PersonAccountController {
	
	
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Anisul");//to get connection

		EntityManager entityManager=entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person  person=new Person();
        person.setName("neeraj");
        person.setEmail("Anisuljgjg@mail.com");
        person.setCno(2804388438585l);
        person.setGender("male");
        
        Account account1 = new Account();
        
        account1.setBank_name("IndusInd bank");
        account1.setAccount_no(778902572837l);
        account1.setIfsc_code("jdpoj323772");
        
        
        
//       Account account2= new Account();
//        account1.setBank_name("HDFC");
//        account1.setAccount_no(7785747572837l);
//        account1.setIfsc_code("jdpoj323989");
        

        
        
        
        Account account3 = new Account();
        account1.setBank_name("State bank");
        account1.setAccount_no(778578534972837l);
        account1.setIfsc_code("jdpoj323890");
        
        
        
        				
		account1.setPerson(person);
	//	account2.setPerson(person);
		account3.setPerson(person);
		
		
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager .persist(account1);
	//	entityManager .persist(account2);
		entityManager .persist(account3);
		entityTransaction.commit();

	}

}
