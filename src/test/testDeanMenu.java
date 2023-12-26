package test;

import java.io.IOException;

import MenuPages.DeanMenu;
import staff.Dean;
import staff.Employee;
import student.Schools;
import teacher.Teacher;
import utilities.Request;

public class testDeanMenu {

	public static void main(String[] args) throws Exception {
        Dean dean = new Dean("Johnson", "Jane", 100000.0, Schools.SAM);
        
        Request request = new Request(dean, "Vacation");
        Employee teacher = new Teacher("Pakita", "Shamoi", 530000);
        teacher.sendRequest(request);

        DeanMenu deanMenu = new DeanMenu(dean, null);
        deanMenu.run();
	}

}