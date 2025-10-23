package KI305.Tykhovska.Lab3;

/**
 * Інтерфейс {@code MilitaryEquipment}, що описує дії військового спорядження альпініста.
 */
public interface MilitaryEquipment {
    /** Очищає зброю. */
    void cleanWeapon();

    /** Знімає зброю (якщо є). */
    boolean unequipWeapon();

    /** Перезаряджає зброю. */
    void reloadWeapon();

    /** Перевіряє, чи альпініст має зброю. */
    boolean hasWeapon();
}