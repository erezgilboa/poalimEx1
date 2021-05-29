package com.poalim.microusers;

import com.poalim.microusers.dao.PersonRepository;
import com.poalim.microusers.entities.Address;
import com.poalim.microusers.entities.Person;
import com.poalim.microusers.enums.Gender;
import com.poalim.microusers.enums.State;
import com.poalim.microusers.servicemanager.personservice.PersonService;
import com.poalim.microusers.viewmodel.AddressVm;
import com.poalim.microusers.viewmodel.PersonVm;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.stubbing.OngoingStubbing;
import org.omg.CORBA.PERSIST_STORE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



@SpringBootTest
class MicrousersApplicationTests {

	@Mock
	private PersonService mockReportUtil;

	@Test
	void addUser() {


		AddressVm address=new AddressVm(State.Israel,"kfar yona","begin","50987",false);
		PersonVm person=new PersonVm();
		person.setAge(26);
		person.setWeight(45.9);
		person.setName("ilan");
		person.setGender(Gender.Male);
		person.setAddressVm(address);
		person.setHeight(1.6);
		when(mockReportUtil.savePerson(person)).thenReturn(person);



	}

}
