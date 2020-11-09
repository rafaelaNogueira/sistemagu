import React, { useState,useEffect } from 'react'
import Container from '@material-ui/core/Container'
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import Typography from '@material-ui/core/Typography';
import Link from '@material-ui/core/Link';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import { getAll } from '../services/cargo.service';
import { makeStyles } from '@material-ui/core/styles';
import Button from '@material-ui/core/Button';

const useStyles = makeStyles((theme) => ({
	'@global': {
	  ul: {
		margin: 0,
		padding: 0,
		listStyle: 'none',
	  },
	},
	appBar: {
	  borderBottom: `1px solid ${theme.palette.divider}`,
	},
	toolbar: {
	  flexWrap: 'wrap',
	},
	toolbarTitle: {
	  flexGrow: 1,
	},
	link: {
	  margin: theme.spacing(1, 1.5),
	},
	espacamento: {
		padding: theme.spacing(8, 0, 6),
	},
	heroContent: {
	  padding: theme.spacing(8, 0, 6),
	},
	cardHeader: {
	  backgroundColor:
		theme.palette.type === 'light' ? theme.palette.grey[200] : theme.palette.grey[700],
	},
  }));

export default _ => {

	const classes = useStyles();

	const [cargo, setCargo] = useState('Nenhum cargo');

	useEffect(async => {
		getAll().then(response => { 
			setCargo(response.data);
			console.log('resposta',response.data)
		})
	}, [])

	return (
		<div>
			<AppBar position="static" color="default" elevation={0} className={classes.appBar}>
        		<Toolbar className={classes.toolbar}>
          			<Typography variant="h6" color="inherit" noWrap className={classes.toolbarTitle}>
            			SGU
          			</Typography>
          			<nav>
            			<Link variant="button" color="textPrimary" href="/cargos/todos" className={classes.link}>
              				Cargos
            			</Link>
            			<Link variant="button" color="textPrimary" href="/perfis/todos" className={classes.link}>
              				Perfis
            			</Link>
            			<Link variant="button" color="textPrimary" href="/usuarios/todos" className={classes.link}>
              				Usuários
            			</Link>
          			</nav>
        		</Toolbar>
      		</AppBar>
			<Container maxWidth="sm" component="main">
        		<Typography component="h2" variant="h2" align="center" color="textPrimary" gutterBottom>
          			Cargos
        		</Typography>
                <Table size="small">
                    <TableHead>
                        <TableRow>
                            <TableCell><b>Nome</b></TableCell>
							<TableCell><b>Ação</b></TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        <TableRow>
                            <TableCell>{ cargo[0].nome }</TableCell>
							<TableCell> 
								<Button variant="contained" href="/cargos/editar" color="secondary">
  									Editar Cargo
								</Button>
							</TableCell>
                        </TableRow>
                    </TableBody>
                </Table>
      		</Container>
            <Container align="center" className={classes.espacamento}>
				<Button variant="contained" href="/cargos/novo" color="primary">
  					Cadastrar Cargo
				</Button>
            </Container>
	  </div>
	)
}