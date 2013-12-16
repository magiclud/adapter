package eu.jpereira.trainings.designpatterns.structural.adapter.thirdparty;

import eu.jpereira.trainings.designpatterns.structural.adapter.exceptions.CodeMismatchException;
import eu.jpereira.trainings.designpatterns.structural.adapter.exceptions.IncorrectDoorCodeException;
import eu.jpereira.trainings.designpatterns.structural.adapter.model.Door;
import eu.jpereira.trainings.designpatterns.structural.adapter.thirdparty.exceptions.CannotChangeCodeForUnlockedDoor;
import eu.jpereira.trainings.designpatterns.structural.adapter.thirdparty.exceptions.CannotUnlockDoorException;

//to sama zaimplementowalam

public class ThirdPartyDoorAdaper extends ThirdPartyDoor implements Door {

	ThirdPartyDoor door;

	@Override
	public void open(String code) throws IncorrectDoorCodeException {
		// TODO Auto-generated method stub
		try {
			door.unlock(code);
		} catch (CannotUnlockDoorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		door.lock();

	}

	@Override
	public boolean isOpen() {
		// TODO Auto-generated method stub
		if (door.getState().equals(DoorState.OPEN)) {
			return true;
		}
		return false;
	}

	@Override
	public void changeCode(String oldCode, String newCode, String newCodeConfirmation) throws IncorrectDoorCodeException,
			CodeMismatchException {
		// TODO Auto-generated method stub
		try {
			door.setNewLockCode(newCode);
		} catch (CannotChangeCodeForUnlockedDoor e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean testCode(String code) {
		// TODO Auto-generated method stub
		return door.DEFAULT_CODE.equals(code);
	}

}
