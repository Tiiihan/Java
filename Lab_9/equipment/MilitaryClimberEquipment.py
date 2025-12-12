# Похідний клас MilitaryClimberEquipment
from equipment.ClimberEquipment import ClimberEquipment
from equipment.TacticalVest import TacticalVest
from equipment.Weapon import Weapon

class MilitaryClimberEquipment(ClimberEquipment):
    def __init__(self, system, helmet, rope, tactical_vest, weapon):
        super().__init__(system, helmet, rope)
        self.tactical_vest = tactical_vest
        self.weapon = weapon

    def clean_weapon(self):
        if self.weapon:
            print("Weapon cleaned!")
        else:
            print("No weapon to clean!")

    def unequip_weapon(self):
        if self.weapon:
            self.weapon = None
            print("Weapon unequipped successfully")
            return True
        print("No weapon to unequip")
        return False

    def reload_weapon(self):
        if self.weapon and self.weapon.magazine_capacity > 0:
            self.weapon.ammo_count = self.weapon.magazine_capacity
            print(f"Weapon reloaded! Ammo: {self.weapon.ammo_count}")
        else:
            print("Cannot reload - no weapon or invalid magazine capacity")

    def total_weight(self):
        base = super().total_weight()
        vest_w = self.tactical_vest.weight if self.tactical_vest else 0
        weapon_w = self.weapon.weight if self.weapon else 0
        return base + vest_w + weapon_w

    def is_full_equipped(self):
        return (super().is_full_equipped() and 
                self.tactical_vest is not None and
                self.weapon is not None)

    def show_info(self):
        super().show_info()
        if self.tactical_vest:
            self.tactical_vest.show_info()
        if self.weapon:
            self.weapon.show_info()