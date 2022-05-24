public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticket = 20_000;
        int bonusMile = service.calculate(ticket);
        System.out.println("Итого накопленных миль: " + bonusMile);
    }
}
