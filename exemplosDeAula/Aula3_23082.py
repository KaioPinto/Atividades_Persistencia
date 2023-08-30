import xml.etree.ElementTree as ET

tree = ET.parse('Python/dados.xml')
root = tree.getroot()

for passageiro in root.findall('passageiro'):
    nome = passageiro.find('nome').text
    ticket = passageiro.find("ticket").text
    print("Nome do passageiro", nome ,"Ticket: ", ticket)