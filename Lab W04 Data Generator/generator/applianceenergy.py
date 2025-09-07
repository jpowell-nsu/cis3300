'''
Created on Sep 7, 2025

@author: Jason Powell
'''

import random
import pandas as pd

# Define appliances and their typical ranges
appliances = [
    ("Refrigerator", "Kitchen", (140, 170), (24, 24), True),
    ("Microwave", "Kitchen", (1000, 1300), (0.3, 1.0), False),
    ("Laptop", "Office", (60, 80), (3, 8), True),
    ("Television", "Living Room", (180, 250), (2, 6), True),
    ("Air Conditioner", "Bedroom", (1400, 1600), (4, 10), False),
    ("Ceiling Fan", "Bedroom", (70, 90), (6, 12), True),
    ("Washing Machine", "Laundry", (450, 550), (1, 2), False),
    ("Dryer", "Laundry", (2800, 3200), (0.8, 1.5), False),
    ("Desk Lamp", "Office", (30, 60), (2, 8), True),
    ("Heater", "Garage", (1600, 2000), (2, 5), False)
]

# Parameters
num_homes = 50
months = ["2025-07", "2025-08", "2025-09"]
records = []

# Generate data
for home_id in range(101, 101 + num_homes):
    for month in months:
        for day in range(1, 29):  # uniform 28 days
            date = f"{month}-{day:02d}"
            chosen_appliances = random.sample(appliances, random.randint(5, 8))
            for appliance, room, watts_range, hours_range, smart_default in chosen_appliances:
                watts = random.randint(*watts_range)
                hours = round(random.uniform(*hours_range), 1)
                smart = smart_default if random.random() > 0.2 else not smart_default
                records.append([home_id, date, appliance, room, watts, hours, smart])

# Create DataFrame
df = pd.DataFrame(records, columns=["HomeID", "Date", "Appliance", "Room", "Watts", "HoursPerDay", "SmartDevice"])

# Save full dataset
df.to_csv("../files/energy_usage_test.csv", index=False)

# Save smaller subset (200 rows for labs)
small_df = df.sample(200, random_state=42).sort_values(by=["HomeID", "Date"])
small_df.to_csv("../files/energy_usage_small_test.csv", index=False)

