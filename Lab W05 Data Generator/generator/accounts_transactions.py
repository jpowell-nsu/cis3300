import csv
import random

# Configuration
NUM_ACCOUNTS = 100
NUM_TRANSACTIONS = 1000

# Output file names
ACCOUNTS_FILE = "../files/accounts_large.csv"
TRANSACTIONS_FILE = "../files/transactions_large.csv"

# Generate random account numbers
def generate_account_number(i):
    return f"A{1000+i}"

# Generate random names
FIRST_NAMES = ["Alice", "Bob", "Carol", "David", "Eva", "Frank", "Grace", "Henry", "Ivy", "Jack"]

def generate_name(i):
    return FIRST_NAMES[i % len(FIRST_NAMES)]

# Generate random accounts
def generate_accounts(num_accounts):
    accounts = []
    for i in range(num_accounts):
        account_number = generate_account_number(i+1)
        owner = generate_name(i)
        balance = round(random.uniform(100, 2000), 2)
        accounts.append([account_number, owner, balance])
    return accounts

# Generate random transactions
def generate_transactions(num_transactions, accounts):
    transactions = []
    account_numbers = [acc[0] for acc in accounts]
    types = ["deposit", "withdraw", "transfer"]

    for _ in range(num_transactions):
        t_type = random.choice(types)
        amount = round(random.uniform(10, 500), 2)

        if t_type == "transfer":
            src, tgt = random.sample(account_numbers, 2)
        else:
            tgt = random.choice(account_numbers)
            src = "null"

        transactions.append([t_type, amount, tgt, src])
    return transactions

# Save accounts to CSV
def save_accounts(accounts, filename):
    with open(filename, mode="w", newline="") as f:
        writer = csv.writer(f)
        writer.writerow(["accountNumber", "ownerName", "balance"])
        writer.writerows(accounts)

# Save transactions to CSV
def save_transactions(transactions, filename):
    with open(filename, mode="w", newline="") as f:
        writer = csv.writer(f)
        writer.writerow(["type", "amount", "targetAccount", "sourceAccount"])
        writer.writerows(transactions)

# Main script
if __name__ == "__main__":
    accounts = generate_accounts(NUM_ACCOUNTS)
    transactions = generate_transactions(NUM_TRANSACTIONS, accounts)

    save_accounts(accounts, ACCOUNTS_FILE)
    save_transactions(transactions, TRANSACTIONS_FILE)

    print(f"Generated {NUM_ACCOUNTS} accounts → {ACCOUNTS_FILE}")
    print(f"Generated {NUM_TRANSACTIONS} transactions → {TRANSACTIONS_FILE}")