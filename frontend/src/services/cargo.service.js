import axios from 'axios'

const url = 'http://localhost:9090/api/cargos/'

export function getAll() {

	return axios.get(url + 'todos/')
}

export function save(cargo) {

	return axios.post(url + '/novo', {...cargo})

}

export function remove(cargo) {

	return axios.post(url + '/remover', {...cargo})

}

export function editar(cargo) {

	return axios.post(url + '/editar', {...cargo})

}