package JavaPOO;

public class FilhoHeranca extends PaiHeranca {

	@Override
	public void Imprimir() {

		System.out.print("Essa � a clase filho\n");
		super.Imprimir();
	}
		

}
