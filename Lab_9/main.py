from equipment.InsuranceSystem import InsuranceSystem
from equipment.Helmet import Helmet
from equipment.ClimbingRope import ClimbingRope
from equipment.RopeType import RopeType
from equipment.TacticalVest import TacticalVest
from equipment.Weapon import Weapon
from equipment.MilitaryClimberEquipment import MilitaryClimberEquipment


def main():
    insurance = InsuranceSystem("Petzl", 800, 50)
    helmet = Helmet("Black Diamond", 350, 57)
    rope = ClimbingRope(RopeType.DYNAMIC, 60, 9.8, 2200)

    vest = TacticalVest(3000, 42)
    weapon = Weapon(10, 30, 4000)

    soldier_equipment = MilitaryClimberEquipment(
        insurance, helmet, rope, vest, weapon
    )

    soldier_equipment.show_info()

    print("\nIs full equipped?", soldier_equipment.is_full_equipped())
    print("Total weight:", soldier_equipment.total_weight())

    soldier_equipment.reload_weapon()
    soldier_equipment.clean_weapon()
    soldier_equipment.unequip_weapon()
    soldier_equipment.clean_weapon()


if __name__ == "__main__":
    main()