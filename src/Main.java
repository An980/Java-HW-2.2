public class Main {
    public static void main(String[] args) {

        int startingScore = 100;//начальный счет
        int replenishmentAmount = 1700;//сумма пополнения

        int bonusRubles;//начисляемый рублевыйбонус
        bonusRubles = (replenishmentAmount / 100);//расчет начилясляемого бонуса

        int finalBalance;//итоговый баланс

        if (replenishmentAmount >= 1000) {
            finalBalance = (startingScore + replenishmentAmount + bonusRubles);
            System.out.println("Итоговый баланс: " + finalBalance);//вывод итогового баланса

        } else if (replenishmentAmount < 1000) {
            finalBalance = (startingScore + replenishmentAmount);
            System.out.println("Итоговый баланс: " + finalBalance);//вывод итогового баланса
        }

    }
}
