public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int mile = service.calculate(10_000);

        System.out.println("Количество начисленных миль: " + mile);
    }
}
