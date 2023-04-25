import javax.swing.JOptionPane;

public class PokemonSelection
{
    private static Pokemon createPokemon() {
        String name = JOptionPane.showInputDialog("Enter the pokemon's name");
        int hitPoints = Integer.parseInt(JOptionPane.showInputDialog("Enter the pokemon's hit points"));
        String move = JOptionPane.showInputDialog("Enter the pokemon's move");
        int movePower = Integer.parseInt(JOptionPane.showInputDialog("Enter the pokemon's move power"));
        int attackSpeed = Integer.parseInt(JOptionPane.showInputDialog("Enter the pokemon's attack speed"));

        return new Pokemon(name, hitPoints, move, movePower, attackSpeed);
    }

    public static void assignPokemon(String[] players) {
        for (String player : players) {
            System.out.printf("Player %s: Select a Pokemon and enter its stats\n\n", player);
            Pokemon newPokemon = PokemonSelection.createPokemon();

            System.out.printf("Player %s Pokemon\n----------------\n", player);
            System.out.println(newPokemon.displayPokemonStats());
        }
    }
}
