import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import Inicial from './views/inicial';
import Cargos from './views/cargos';
import Perfis from './views/perfis';
import Usuarios from './views/usuarios';

export default props => {

	return (
		<BrowserRouter>
			<Switch>
				<Route path='/' exact={true} component={Inicial} />
				<Route path='/cargos/todos' exact={true} component={Cargos} />
				 <Route path='/perfis/todos' exact={true} component={Perfis} />
				 <Route path='/usuarios/todos' exact={true} component={Usuarios}/>
			</Switch>
		</BrowserRouter>
	)

}