public class Main {
    public static void main(String[] args) {
   Restaurante r1= new Restaurante("Restaurante do BIBI","999999","Rua teu cu", "Italiana");
   r1.setAvaliacao("5");
   System.out.println("O nome do restaurante e "+ r1.getNome());
   System.out.println("A avalicao do reestaurante e "+ r1.getAvaliacao());
   Pessoa c1 = new Pessoa("Gabriel", "01996289047");
   r1.setChef(c1);
   System.out.println("O chef do restaurante eh o " + r1.getChef().getNome());
}
}