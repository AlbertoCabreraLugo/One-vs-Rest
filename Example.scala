//Regresión logística para multiclases utilizando One-vs-Rest
from sklearn.datasets import make_classification
from sklearn.linear_model import LogisticRegression

//Definir conjunto de datos
X, y = make_classification(n_samples=1000, n_features=10, n_informative=5, n_redundant=5, n_classes=3, random_state=1)

//Definir el modelo
model = LogisticRegression(multi_class='ovr')

//Ajustar el modelo
model.fit(X, y)

//Hacer predicciones
yhat = model.predict(X)