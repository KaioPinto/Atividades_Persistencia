import requests as ret
import json

titulo = ret.get('http://www.omdbapi.com/?i=tt3896198&apikey=a2bc1e25').json()['Title']
ano = ret.get('http://www.omdbapi.com/?i=tt3896198&apikey=a2bc1e25').json()['Year']
tempo = ret.get('http://www.omdbapi.com/?i=tt3896198&apikey=a2bc1e25').json()['Runtime']
genero = ret.get('http://www.omdbapi.com/?i=tt3896198&apikey=a2bc1e25').json()['Genre']
diretor = ret.get('http://www.omdbapi.com/?i=tt3896198&apikey=a2bc1e25').json()['Director']
premios = ret.get('http://www.omdbapi.com/?i=tt3896198&apikey=a2bc1e25').json()['Awards']

bd = {'Titulo': titulo, "Ano: ": ano, "Tempo: ":tempo, "Genero: ": genero, "Diretor: ":diretor, "Premios: ":premios}
with open ('bd.json', "w") as file:
    json.dump(bd, file, indent= 4)






#titulo, ano, genero,tempo,diretor,cidade

