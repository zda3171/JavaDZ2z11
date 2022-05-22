public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticket = 10_000;
        int bonusmile = service.calculate(ticket);
        System.out.println("Итого накопленных миль: " + bonusmile);
    }
}
