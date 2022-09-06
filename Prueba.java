package empresa.arreglo;

public class Prueba {
	public static void main(String[]args) {
		
		Trabajadores t1= new Trabajadores(2345, "Carlos", "Perez", "Castillo", 0, 9850, 2017); 
		Trabajadores t2= new Trabajadores(5754, "Angel", "Gomez", "Garrido", 1, 9850, 2020); 
		Trabajadores t3= new Trabajadores(5345, "Jesus", "Martin", "Santos", 2, 9850, 2016);
		Trabajadores t4= new Trabajadores(3267, "David", "Jimenez", "Lozano", 2, 9850, 2017);
		Trabajadores t5= new Trabajadores(3287, "Pedro", "Ruiz", "Guerrero", 2, 9850, 2017);
		Trabajadores t6= new Trabajadores(5454, "Daniel", "Hernzandez", "Cano", 3, 9850, 2018);
		Trabajadores t7= new Trabajadores(3456, "Alejandro", "Diaz", "Prieto", 2, 9850, 2018);
		Trabajadores t8= new Trabajadores(3445, "Maria", "Moreno", "Mnedez", 1, 9850, 2018);
		Trabajadores t9= new Trabajadores(9088, "Alberto", "Munoz", "Cruz", 1, 9850, 2017);
		Trabajadores t10= new Trabajadores(8877, "Rafael", "Alvarez", "Flores", 2, 9850, 2017);
		Trabajadores t11= new Trabajadores(6767, "Fernando", "Romero", "Herrera", 4, 9850, 2019);
		Trabajadores t12= new Trabajadores(5654, "Pablo", "Alonso", "Gallego", 1, 9850, 2019);
		Trabajadores t13= new Trabajadores(4323, "Jorge", "Gutierrez", "Marquez", 2, 9850, 2020);
		Trabajadores t14= new Trabajadores(2232, "Ramon", "Navarro", "Leon", 1, 9850, 2016);
		
		Arreglo<Trabajadores> lista = new Arreglo(13);
		System.out.println( lista );
         lista.setElemento(0,t1);
         lista.setElemento(1, t2);
         lista.setElemento(2, t3);
         lista.setElemento(3, t4);
         lista.setElemento(4, t5);
         lista.setElemento(5, t6);
         lista.setElemento(6, t7);
         lista.setElemento(7, t8);
         lista.setElemento(8, t9);
         lista.setElemento(9, t10);
         lista.setElemento(10, t11);
         lista.setElemento(11, t12);
         lista.setElemento(12, t13);
         lista.setElemento(13, t14);
         
        System.out.println(lista);
        
	}

}
