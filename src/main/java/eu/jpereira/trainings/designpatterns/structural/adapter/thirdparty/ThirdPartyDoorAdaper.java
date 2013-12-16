package eu.jpereira.trainings.designpatterns.structural.adapter.thirdparty;

import eu.jpereira.trainings.designpatterns.structural.adapter.exceptions.CodeMismatchException;
import eu.jpereira.trainings.designpatterns.structural.adapter.exceptions.IncorrectDoorCodeException;
import eu.jpereira.trainings.designpatterns.structural.adapter.model.Door;
import eu.jpereira.trainings.designpatterns.structural.adapter.model.SimpleDoor;

//to sama zaimplementowalam

public class ThirdPartyDoorAdaper extends ThirdPartyDoor implements Door{

	@Override
	public void open(String code) throws IncorrectDoorCodeException {
		// TODO Auto-generated method stub
		Door door = new SimpleDoor();
		door.open(code);
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		

	}

	@Override
	public boolean isOpen() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void changeCode(String oldCode, String newCode, String newCodeConfirmation) throws IncorrectDoorCodeException,
			CodeMismatchException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean testCode(String code) {
		// TODO Auto-generated method stub
		return false;
	}

}
