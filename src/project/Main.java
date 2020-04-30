package project;

import static project.UseCaseName.*;

public class Main {
	public static void main(String[] args) {
		Controller ctrl = new Controller(AttributeName.values(), UseCaseName.values());
		
		ctrl.call(jouerCoup);
		ctrl.entToIhm();
		System.out.println("\nhehe\n");
		ctrl.call(jouerCoup);
	}
}
