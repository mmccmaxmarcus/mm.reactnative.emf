import React, Component from 'react' 
import {Text, FlatList, StyleSheet, View} from 'react-native'
export default class Module extends Component{ 
 
state = { 
module:[
	{id: Math.random(), module: 'Introduction to project management', concepts: [
	{id: Math.random(), concept: 'Project management', elements: [
	{ },
	{ },
	{ },],  },
	{id: Math.random(), concept: 'Project', elements: [
	{ },],  },
	{id: Math.random(), concept: 'What is Project Management?', elements: [
	{ },],  },
	{id: Math.random(), concept: 'Stakeholders', elements: [
	{ },],  },
	{id: Math.random(), concept: 'Sponsor', elements: [
	{ },],  },
	{id: Math.random(), concept: 'PMI', elements: [
	{ },],  },],  },
	{id: Math.random(), module: 'References', },]
}
render() { 

return( 
	<View >
 		<FlatList data={state.module} keyExtractor={item} 
renderItem={}/>
 	</View>
)}
