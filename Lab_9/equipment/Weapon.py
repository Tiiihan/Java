# Клас Weapon описує зброю військового альпініста

class Weapon:
    def __init__(self, ammo_count, magazine_capacity, weight):
        self.ammo_count = ammo_count
        self.magazine_capacity = magazine_capacity
        self.weight = weight

    def show_info(self):
        print("Weapon")
        print(f"\tAmmo: {self.ammo_count}, Weight: {self.weight}, "
              f"Magazine capacity: {self.magazine_capacity}")