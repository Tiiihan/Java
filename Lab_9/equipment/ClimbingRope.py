# Клас ClimbingRope описує альпіністську мотузку

class ClimbingRope:
    def __init__(self, rope_type, length, diameter, breaking_load):
        self.rope_type = rope_type
        self.length = length
        self.diameter = diameter
        self.breaking_load = breaking_load

    def show_info(self):
        print("Climbing rope")
        print(f"\tType: {self.rope_type.name}, length: {self.length}, "
              f"diameter: {self.diameter}, breaking load: {self.breaking_load} kg")