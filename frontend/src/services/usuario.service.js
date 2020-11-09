import axios from 'axios'

const url = 'http://localhost:9090/api/usuarios/'

export function getAll() {

	return axios.get(url + 'todos/')
}

export function save(usuario) {

	return axios.post(url + 'novo/', {...usuario})

}

export function remove(usuario) {

	return axios.post(url + 'remover/', {...usuario})

}

export function editar(usuario) {

	return axios.post(url + 'editar/', {...usuario})

}