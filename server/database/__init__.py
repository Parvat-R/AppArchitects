CREATE_TABLE_SESSION = """
    CREATE TABLE IF NOT EXISTS session (
        sessionID INTEGER PRIMARY KEY AUTOINCREMENT,
        farmerID INTEGER FOREIGN KEY,
        loginOn DATETIME NOT NULL DEFAULT now(),
        logoutOn DATETIME DEFAULT NULL,
        deviceDetail VARCHAR(255) NOT NULL,
    )
"""


CREATE_TABLE_SUPPLIER = """
    CREATE TABLE IF NOT EXISTS supplier (
        farmerID INTEGER PRIMARY KEY AUTOINCREMENT,
        name Varchar(255) NOT NULL,
        dob DATETIME NOT NULL,
        contactNo INTEGER UNIQUE NOT NULL,
        address varchar(255) NOT NULL,
        societyID FOREIGN KEY REFERENCES (society.supplierID)
    );
"""

CREATE_TABLE_TRANSACTION = """
    CREATE TABLE IF NOT EXISTS transaction (
        transactionID INTEGER PRIMARY KEY AUTOINCREMENT,
        farmerID INTEGER FOREGIN KEY REFERENCES (supplier.farmerID),
        dateOfTransaction DATETIME NOT NULL DEFAULT now(),
        quantity DECIMAL(10, 5) NOT NULL,
        quality DECIMAL (15, 7) NOT NULL,
        rate DECIMAL(10, 5) NOT NULL,
        societyID FOREGIN KEY REFERENCES (society.societyID)
    )
"""


CREATE_TABLE_SOCIETY = """
    CREATE TABLE IF NOT EXISTS society (
        societyID INTEGER PRIMARY KEY AUTOINCREMENT,
        name VARCHAR(255) NOT NULL,
        district VARCHAR(255) NOT NULL,
        taluk CHAR(64) NOT NULL,
        block VARCHAR(255) NOT NULL,
        villagePanchayat VARCHAR(255) NOT NULL,
        revenueVillage VARCHAR(255) NOT NULL
    )
"""

