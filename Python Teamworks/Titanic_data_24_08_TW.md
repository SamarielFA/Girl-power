# Teamwork

EASY: add DecisionTreeClassifier to titanic data predictions. 
HARD: Investigate what is cross-validation and implement cross-validation on any classification model you prefer on Titanic data. Explain to each other, what do you see. 

Example: 
 
k_fold = KFold(n_splits=10, shuffle=True, random_state=42)
accuracy_scores = cross_val_score(model_knn_cv, X, y, cv=k_fold, scoring='accuracy')


Easy
```python
Easy

from sklearn.tree import DecisionTreeClassifier #import

dtc_model = DecisionTreeClassifier()    # initialize

dtc_model.fit(X_train, y_train)   # train

dtc_prediction_results = dtc_model.predict(X_test)
dtc_prediction_results
```
