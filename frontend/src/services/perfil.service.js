import axios from 'axios'

const url = 'http://localhost:9090/api/perfis/'

export function getAll() {

	return axios.get(url + 'todos/')
}

export function save(perfil) {

	return axios.post(url + 'novo/', {...perfil})

}

export function remove(perfil) {

	return axios.post(url + 'remover/', {...perfil})

}

export function editar(perfil) {

	return axios.post(url + 'editar/', {...perfil})

}