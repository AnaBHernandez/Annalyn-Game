package devanabelen;

public class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;  // Puede atacar si el caballero no está despierto
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;  // Puede espiar si alguno está despierto
    }

    public static boolean canSignalPrisoner(boolean isPrisonerAwake) {
        return !isPrisonerAwake;  // Puede señalizar si el prisionero no está despierto
    }

    public static boolean canFreePrisoner(boolean isGuardAwake) {
        return !isGuardAwake;  // Puede liberar al prisionero si el guardia no está despierto
    }
}
