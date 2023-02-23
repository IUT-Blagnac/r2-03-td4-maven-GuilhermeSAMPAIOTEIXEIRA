public class Pile {

	private int sommet;
	private int[] tab;
	
	/* Constructeur de Pile
	 * 
	 * @param pfI IN: entier représentant la taille de la pile
	 * 
	 */
	Pile(int pfI) {
		this.sommet = - 1;
		this.tab = new int[pfI];
	}

	/* Fonction qui vérifie si la pile est vide ou non
	 * 
	 * @return true si la pile est vide, false sinon
	 */
	public boolean est_vide() {
		return sommet == -1;
	}

	/* Empile une valeur dans la pile
	 * 
	 * @param pfVal IN: entier à empiler
	 */
	public void empiler(int pfVal) {
		this.sommet++;
		this.tab[this.sommet] = pfVal;
	}

	/* Dépile une valeur dans la pile si et seulement si la pile n'est pas vide
	 * 
	 * @throws La pile est vide
	 * @see est_vide
	 */
	public int depiler() throws Exception{
		if(!this.est_vide()) {
			this.sommet--;
			return this.tab[this.sommet + 1];
		} else {
			throw new Exception("La pile est vide");
		}
	}
}
