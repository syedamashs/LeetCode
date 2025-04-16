# A complete guide to solve Leetcode Pandas problems (2877–2891)

# ============================
# 🔹 Problem 2877: Create DataFrame

import pandas as pd
from typing import List

def createDataframe(student_data: List[List[int]]) -> pd.DataFrame:
    return pd.DataFrame(student_data, columns=["student_id", "age"])

# ============================
# 🔹 Problem 2878: Get DataFrame Size

import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    return list(players.shape)

# ============================
# 🔹 Problem 2879: Select First 3 Rows

import pandas as pd

def selectFirstRows(employees: pd.DataFrame) -> pd.DataFrame:
    return employees.head(3)

# ============================
# 🔹 Problem 2880: Filter Rows (student_id == 101)

import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    return students[students['student_id'] == 101][['age']]

# ============================
# 🔹 Problem 2881: Add New Column (Double Salary)

import pandas as pd

def modifySalaryColumn(employees: pd.DataFrame) -> pd.DataFrame:
    employees['salary'] = employees['salary'] * 2
    return employees

# ============================
# 🔹 Problem 2882: Drop Duplicate Rows

import pandas as pd

def dropDuplicateEmails(customers: pd.DataFrame) -> pd.DataFrame:
    return customers.drop_duplicates(subset='email')

# ============================
# 🔹 Problem 2883: Drop Rows with None

import pandas as pd

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
    return students.dropna()

# ============================
# 🔹 Problem 2884: Modify Column Values

import pandas as pd

def modifySalary(employees: pd.DataFrame) -> pd.DataFrame:
    employees['salary'] = employees['salary'] * 2
    return employees

# ============================
# 🔹 Problem 2885: Rename Column

import pandas as pd

def renameColumns(students: pd.DataFrame) -> pd.DataFrame:
    return students.rename(columns={'id': 'student_id'})

# ============================
# 🔹 Problem 2886: Change Data Type

import pandas as pd

def changeDatatype(students: pd.DataFrame) -> pd.DataFrame:
    students['grade'] = students['grade'].astype('int')
    return students

# ============================
# 🔹 Problem 2887: Fill Missing Values (Specific Column)

import pandas as pd

def fillMissingValues(students: pd.DataFrame) -> pd.DataFrame:
    students['grade'] = students['grade'].fillna(0)
    return students

# ============================
# 🔹 Problem 2888: Concatenate DataFrames

import pandas as pd

def concatenateTables(df1: pd.DataFrame, df2: pd.DataFrame) -> pd.DataFrame:
    return pd.concat([df1, df2], ignore_index=True)

# ============================
# 🔹 Problem 2889: Pivot Table

import pandas as pd

def pivotTable(weather: pd.DataFrame) -> pd.DataFrame:
    return weather.pivot(index='date', columns='city', values='temperature')

# ============================
# 🔹 Problem 2890: Melt Table

import pandas as pd

def meltTable(report: pd.DataFrame) -> pd.DataFrame:
    return report.melt(id_vars=['product'], var_name='quarter', value_name='sales')

# ============================
# 🔹 Problem 2891: Method Chaining (Filter, Sort, Select)

import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    return animals[animals['weight'] > 100].sort_values(by='weight', ascending=False)[['name']]
