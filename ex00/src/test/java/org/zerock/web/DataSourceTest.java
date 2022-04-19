package org.zerock.web;



import java.sql.Connection;



import javax.inject.Inject;

import javax.sql.DataSource;



import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



//�Ʒ� �ΰ��� �������̼��� ���� �׽�Ʈ �ڵ带 ������ �� �������� �ε��ǵ��� �ϴ� �κ�

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(

		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class DataSourceTest {



	//@Inject >> ����:�ڹٿ��� ����, ������:Ÿ�Կ� ���缭 ����

	//�������� �����ؼ� ����ó���ȴ�.

	@Inject

	private DataSource ds;	



	@Test

	public void testConection() throws Exception{

		try {

			Connection con = ds.getConnection();

			System.out.println(con); //��ü �ּҰ� ���

		}catch(Exception e) {

			e.printStackTrace();

		}

	}

}