# 🐼 Pandas Guide for Leetcode Problems 2877 to 2891

This guide is written for anyone who wants to solve Leetcode pandas problems with confidence. It starts from the basics and covers only what's **necessary**, in a clean and structured format.

---

## ✨ What is Pandas?
Pandas is a Python library used for working with **tabular data** (like Excel spreadsheets). It allows you to:
- Load data
- Filter rows/columns
- Modify values
- Clean data (remove duplicates, handle nulls)
- Reshape tables (pivot, melt)

It uses two main data structures:
- **Series**: One-dimensional
- **DataFrame**: Two-dimensional (like a table)

---

## 📊 Creating a DataFrame
```python
import pandas as pd

# From a list of lists:
df = pd.DataFrame([[1, 21], [2, 19]], columns=['student_id', 'age'])

# From a dictionary:
data = {'name': ['Alice', 'Bob'], 'score': [90, 85]}
df = pd.DataFrame(data)
```

---

## 📈 Basic Exploration
```python
df.shape         # (rows, columns)
df.head(n)       # First n rows
df.info()        # Column types and non-null counts
df.columns       # List column names
```

---

## 🔢 Selecting Data
### Selecting Columns:
```python
df['col']                # Single column
df[['col1', 'col2']]     # Multiple columns
```

### Filtering Rows:
```python
df[df['col'] == 101]               # Equals

# Multiple conditions:
df[(df['age'] > 20) & (df['score'] > 80)]
```

---

## 🔄 Modifying Data
### Change values:
```python
df['salary'] = df['salary'] * 2
```

### Add new columns:
```python
df['double_salary'] = df['salary'] * 2
```

### Rename columns:
```python
df.rename(columns={'old_name': 'new_name'}, inplace=True)
```

### Change data type:
```python
df['age'] = df['age'].astype(int)
```

### Fill missing data:
```python
df['marks'].fillna(0, inplace=True)      # Fill NaN with 0
```

### Drop missing rows:
```python
df.dropna(inplace=True)
```

### Drop duplicates:
```python
df.drop_duplicates(subset='email', inplace=True)
```

---

## 🔝 Sorting and Ranking
```python
df.sort_values(by='age', ascending=False)
df.sort_values(by=['score', 'age'])
```

---

## 🔹 Reshaping Data
### Concatenate:
```python
pd.concat([df1, df2])
```

### Pivot:
```python
df.pivot(index='student_id', columns='subject', values='marks')
```

### Melt:
```python
pd.melt(df, id_vars=['student_id'], value_vars=['math', 'science'])
```

---

## ✨ Method Chaining
Use multiple operations in one line:
```python
df.dropna().sort_values('score')[['name', 'score']]
```

---

## ✅ With this guide, you can:
- Load and create DataFrames
- Filter/select rows and columns
- Modify and clean data
- Combine or reshape datasets
- Handle real-world messy data easily

This is **enough to solve every Leetcode pandas problem from 2877 to 2891**.

Now go crush it ⚡️
