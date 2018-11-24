# language: es

@tag
Característica: Autenticar
  Yo como usuario quiero autenticarme para validar mis credenciales


Escenario: Autenticar
	Dado que me autentico con usuario XXXXX y contraseña XXXXXX
	Cuando realizo una consulta en SQL para el miembro ST12110955 
	Entonces deberia ver el estado del miembro igual a R