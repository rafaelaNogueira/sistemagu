import React from 'react'
import Container from '@material-ui/core/Container'
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import Typography from '@material-ui/core/Typography';
import Link from '@material-ui/core/Link';
import { makeStyles } from '@material-ui/core/styles';

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
	heroContent: {
	  padding: theme.spacing(8, 0, 6),
	},
	cardHeader: {
	  backgroundColor:
		theme.palette.type === 'light' ? theme.palette.grey[200] : theme.palette.grey[700],
	},
	cardPricing: {
	  display: 'flex',
	  justifyContent: 'center',
	  alignItems: 'baseline',
	  marginBottom: theme.spacing(2),
	},
	footer: {
	  borderTop: `1px solid ${theme.palette.divider}`,
	  marginTop: theme.spacing(8),
	  paddingTop: theme.spacing(3),
	  paddingBottom: theme.spacing(3),
	  [theme.breakpoints.up('sm')]: {
		paddingTop: theme.spacing(6),
		paddingBottom: theme.spacing(6),
	  },
	},
  }));

export default _ => {
	const classes = useStyles();

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
			<Container maxWidth="sm" component="main" className={classes.heroContent}>
        		<Typography component="h1" variant="h2" align="center" color="textPrimary" gutterBottom>
					Sistema de Gerenciamento de Usuário
        		</Typography>
      		</Container>
	  	</div>
	)
}