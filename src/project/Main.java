package project;

import static project.UseCaseName.*;

public class Main {
	public static void main(String[] args) {
		Controller ctrl = new Controller();
		
		ctrl.getUseCase(jouerCoup).doIt();
		ctrl.entToIhm();
		System.out.println("\nhehe\n");
		ctrl.getUseCase(jouerCoup).doIt();
	}
}
