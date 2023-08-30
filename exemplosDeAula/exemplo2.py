import requests as ret
import json

# URL da API e chave de API (substitua pela sua chave real)
url = "https://www.omdbapi.com/"
api_key = "http://www.omdbapi.com/?i=tt3896198&apikey=a2bc1e25"

# Parâmetros para a requisição
params = {
    "apikey": api_key,
    "s": "movie"  # Parâmetro de exemplo
}

# Faz uma requisição GET para obter os dados
response = ret.get(url, params=params)
data = response.json()

# Verifica se a requisição foi bem-sucedida
if "Search" in data:
    movies = data["Search"]

    # Seleciona 6 atributos dos filmes obtidos
    selected_data = []
    for movie in movies:
        selected_item = {
            "Title": movie.get("Title"),
            "Year": movie.get("Year"),
            "imdbID": movie.get("imdbID"),
            "Type": movie.get("Type"),
            "Poster": movie.get("Poster"),
            "Genre": movie.get("Genre")
        }
        selected_data.append(selected_item)

    # Converte os dados selecionados para JSON e escreve em um arquivo
    with open("dados.json", "w") as json_file:
        json.dump(selected_data, json_file, indent=4)
else:
    print("Requisição não foi bem-sucedida. Verifique a chave de API e os parâmetros.")