package projetovideo;

public class ProjetoVideo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video v[] = new Video[2];
		v[0] = new Video("aula14");
		v[1] = new Video("aula13");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("jaco",19,"masc","jks");
		
		Visualizacao vis = new Visualizacao(g[0], v[0]);
		vis.avaliar();
		
		//System.out.println(g[0].toString());
		System.out.println(vis.toString());
		
	}

}