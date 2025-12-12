#Базовий клас ClimberEquipment

class ClimberEquipment:
    def __init__(self, system=None, helmet=None, rope=None):
        self.insurance_system = system
        self.helmet = helmet
        self.rope = rope

    def show_info(self):
        print("\nInfo about climber's equipment:")
        if self.insurance_system:
            self.insurance_system.show_info()
        if self.helmet:
            self.helmet.show_info()
        if self.rope:
            self.rope.show_info()

    def total_weight(self):
        weight = 0
        if self.helmet:
            weight += self.helmet.weight
        if self.insurance_system:
            weight += self.insurance_system.weight
        return weight

    def is_full_equipped(self):
        return (self.insurance_system is not None and
                self.helmet is not None and
                self.rope is not None)