import App from "../App";

describe('App component tests', () => {
    it('should mount the component', () => {
        cy.mount(<App />)
    })
})